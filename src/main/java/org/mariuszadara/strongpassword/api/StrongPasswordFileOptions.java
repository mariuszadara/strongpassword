package org.mariuszadara.strongpassword.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class StrongPasswordFileOptions extends StrongPasswordMapOptions {

	public StrongPasswordFileOptions(File file) {
		super(Collections.emptyMap());
		loadFromFile(file);
	}

	private void loadFromFile(File file) {
		validateFile(file);
		var map = extractFromFileAsMap(file);
		loadFromMap(map);
	}
	
	private void validateFile(File file) {
		if (file == null) {
			throw new StrongPasswordException(StrongPasswordException.OPTIONS_FILE_NOT_SPECIFIED, "The file has not been specified");
		}
		if (!file.exists()) {
			throw new StrongPasswordException(StrongPasswordException.OPTIONS_FILE_NOT_FOUND, String.format("The file does not exists: %s", file));
		}
		if (!file.isFile()) {
			throw new StrongPasswordException(StrongPasswordException.OPTIONS_FILE_NOT_REGULAR_FILE, String.format("Invalid file: %s", file));
		}
		if (!file.canRead()) {
			throw new StrongPasswordException(StrongPasswordException.OPTIONS_FILE_NOT_READABLE, String.format("Unreadable file: %s", file));
		}
	}
	
	private Map<String, Object> extractFromFileAsMap(File file) {

		if (file.length() == 0) {
			return Collections.emptyMap();
		}
		
		var props = new Properties();

		try (InputStream is = new FileInputStream(file)){
			props.load(is);
		}
		catch (Exception e) {
			throw new StrongPasswordException(StrongPasswordException.OPTIONS_FILE_LOADING_FAILED, e);
		}
		
		if (props.isEmpty()) {
			return Collections.emptyMap();
		}
		
		Map<String, Object> map = new HashMap<>();
		props.entrySet().forEach(e -> map.put((String) e.getKey(), e.getValue()));
		
		return map;
	}
}

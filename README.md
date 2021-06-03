<br />
<p align="center">
  <a href="https://github.com/mariuszadara/strongpassword">
    <img src="logo.png" alt="Logo" width="85px" height="85px">
  </a>

  <h3 align="center">Strong password</h3>

  <p align="center">
    A simple tool written in Java to generate a strong password.
    <br />
    <a href="https://github.com/mariuszadara/strongpassword"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/mariuszadara/strongpassword">View Demo</a>
    ·
    <a href="https://github.com/mariuszadara/strongpassword/issues">Report Bug</a>
    ·
    <a href="https://github.com/mariuszadara/strongpassword/issues">Request Feature</a>
  </p>
</p>



<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#concepts">Concepts</a></li>
      </ul>
    </li>
    <li>
  		<a href="#usage">Usage</a>
    	<ul>
        	<li><a href="#prerequisites">Complete example</a></li>
        	<li><a href="#concepts">Options</a></li>
			<li><a href="#liveexample">Live example</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>


## About The Project

This project is all about having a tool to generate strong passwords, that is passwords composed of various upper-case and lower-case characters, numbers and symbols that you choose.
This is the first line of defense against unauthorized access and the stronger the password, the more protection you will have. 



### Built With

This project has been built using Java 10 specifications and Eclipse as an IDE.



## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.


### Prerequisites

In order to use this tool, your project should at least comply with Java 10.
No other libraries are required.



### Concepts

In order to interact with this tool, few concepts are needed to be understood first, such as:

- **options** : various parameters used in the application. These parameters specify for example the length of the password, the dictionaries used to generate it, etc. 
- **generator**: this component is used to generate the passwords based on the current options.
- **validator**: this component is used to validate the passwords that have been generated.
- **estimator**: this component is used to estimate the time needed to crack the given password. 
- **scorer**: this component is used to compute a score for a generated password. 
 
 

## Usage

The following script shows a basic usage of all the components mentioned above and standard options:

- setup your `module-info.java` to use the strong password module: `requires org.mariuszadara.strongpassword;`

- instantiate the options that you want to use, such as the default ones: `var options = new StrongPasswordOptions();`. 
Additionally, you might want to use options that are based on a file (`StrongPasswordFileOptions`) or by a map (`StrongPasswordMapOptions`) - 
the keys and their meaning are described at the end of this section.

- once you have the options prepared, is time to instantiate the generator: `var generator = StrongPasswordGeneratorFactory.make();`

- all left now is to generate the passwords based on the provided options: `var passwords = generator.generatePasswords(options);`

<br/>
That's it. 

<br/><br/>
You have now a list of passwords that you can use or, optionally: 

- compute score: `var scorer = StrongPasswordScorerFactory.make(); passwords.forEach(password -> scorer.computeScore(options, password))`

- estimate decode time: `var estimator = StrongPasswordEstimatorFactory.make();passwords.forEach(password -> estimator.estimateDecodeTime(options, password))`

- having score and/or decode time, you can sort the list of passwords according to your needs and present them to the user. 



### Complete example

You can find a complete example with all the explanations here: [Strong password example](StrongPasswordExample.java).
It will generate some passwords according to the default options, having them sorted descending by the score and time and present them into the console output.
 


### Live example

A live project based on this application you can find at: [Strong password live REST](https://api.zadara.org/strongpassword/)
Just do a GET request having in it's body the JSON indicating the properties, and you will obtain a list of passwords.



### Options

There are various options you can pass to the application via the dedicated objects. You can also set your own value by using dedicated setters, 
but if you want to use load the options from a file or a map, you should use this properties file, where all the keys and their meaning are present:  

[Strong password options file](options.properties)



## Roadmap

See the [open issues](https://github.com/mariuszadara/strongpassword/issues) for a list of proposed features (and known issues).



## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/StrongerPassword`)
3. Commit your Changes (`git commit -m 'Add some StrongerPassword'`)
4. Push to the Branch (`git push origin feature/StrongerPassword`)
5. Open a Pull Request



## License

Distributed under the MIT License. See `LICENSE` for more information.



## Contact

Marius Zadar&atilde; - github@zadara.org

Project Link: [https://github.com/mariuszadara/strongpassword](https://github.com/mariuszadara/strongpassword)


### BUILT USING:
1. Selenium - for Web Automation, cross browser testing
2. Extent Reports - for HTML reporting
3. TestNG - for parallel execution and automatic rerun of failed test cases
4. Maven - for project/dependency management
5. SLF4J - for logs
6. POI - for handling Excel test data
7. PDFBox - for handling PDFs

### STEPS TO INSTALL:
1. Download and install JDK latest stable version
2. Download Node JS 
3. Download Maven
4. Download and install Eclipse IDE for JAVA Web Developers
5. Set the environment variables in the OS

	1. WINDOWS -> Set the following SYSTEM environment variables for JAVA, Maven & NODE	
		JAVA_HOME -> 	C:\Program Files\Java\jdk-11.0.13
		NODE_HOME -> 	C:\Program Files\nodejs
		MAVEN_HOME -> 	C:\apache-maven-3.8.4
		PATH -> 
		%MAVEN_HOME%
		%MAVEN_HOME%\node_modules\npm\bin
		%MAVEN_HOME%\bin
		%JAVA_HOME%\bin		
	2. MACOS->
		1. Open the bash profile in the TERMINAL,
			vi ~/.bash_profile
		2. Use the below set of commands to save the environment variables
			Hit "i" to insert and enter the below set of statements			
			export JAVA_HOME=$(/usr/libexec/java_home)
			export MAVEN_HOME=/Users/<user_name>/Documents/apache-maven-3.6.3
			export M2=$MAVEN_HOME/bin
			export PATH=$PATH:/usr/local/git/bin:/usr/local/bin:			
			Hit "ESC" ":wq"			
			We need not explicitly add path for Node since Node & Python are present in the /usr/local/bin and we have already included them in the PATH variable as displayed above.
		3. Use the below command to source the bash_profile
			source ~/.bash_profile

### FEATURES:
1. Parallel Execution
2. Automatic Rerun of failed test cases
3. HTML Reports (Extent reports, Cucumber Reports)
4. Logger mechanism
5. This can be directly integrated with Jenkins
6. Cross Browser Execution
7. Can be tweaked to execute in Cloud/grid

### HOW TO EXECUTE:
1. Extract the Zip
2. Use Eclipse IDE to import the project
3. Go to TestNG folder in "sr/test/resources" and open the XML file
4. Run the file as TestNG Test

### WHERE TO FIND:
* TestNG files are found in "src/test/resources/TestNG" folder
* TestData files are found in "src/test/resources/TestData" folder
* PageObjects are found in "src/test/java/pages" folder
* Tests are found in "src/test/java/tests" folder
* Reports are found in "extent-reports/Report_DDMMYYYY" folder

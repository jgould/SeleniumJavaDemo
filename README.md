# SeleniumJavaDemo

## Install Java

Check to see if Java is already installed, open the command promt and enter 
java -version

If you get 'java' is not recognised as an internal or external operable program or batch file.

Then follow these steps:

Download latest version of the Java SDK (https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
Install it
Open edit system variables
Advanced -> Enviroment Varibles -> System verabiles -> New
Name : JAVA_HOME
Value : [location the jdk was installed to, i.e C:\Program Files\Java\jdk-17]
Path Variable -> New
%JAVA_HOME%\bin
Press OK to save the change
Return to the command prompt and eter java -version again

You will likely get the same error at this point, just close then reopen the window.

When you reopen and try the command java -version, you should see:

java version "17.0.6" 2023-01-17 LTS
Java(TM) SE Runtime Environment (build 17.0.6+9-LTS-190)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.6+9-LTS-190, mixed mode, sharing)

This means that Java has been successfully installed

## Setup Eclipse

Download eclipse and install
Make sure that the latest JDK is selected (the one you installed previously)
Help -> Eclipse Marketplace -> Search for Cucumber plugin
Install the first result (Cucumber Eclipse Plugin)

## Setup Project

File -> New -> Project
Maven -> Maven Project -> Create a simple project (skip archetype selection)
Group Id: [a unique base name of the company or group that created the project]
Artifact Id: [a unique name of the project]

Search for Maven central repository in a browser
Select mvnrepository.com then search for cucumber java and select the first result (Cucumber JVM: Java)
Select the latest version
Copy the contents of the Maven tab

Back in eclipse open the pom.xml file
Add a few lines between the </version> and </project>
And a <dependencies> block
Paste the code from the Maven central repository that you copied earlier
Save the file
Eclipse will now download the dependency
A new package will now be displayed called Maven Dependencies when you expand it you will see 15 files most of which will be name cucumber-

There will sometimes be an error displayed on the screen related to the JRE Compiler
Right click on the JRE System Library then select Workspace default JavaSE (jre) then Apply and Close

## Gherkin Format

Now to test that everything up to this point is working properly.

Create two files under src/test/resources one named cucumber.properties the other named junit-platform.properties
In both enter cucumber.publish.quiet=true and save

Right click on src/test/java (or wherever you are going to store your tests)
Create a new package, within the package create a new file with the name ending with .feature
When the file opens you'll see a large block of red commented out text, this whole file is basically an example of how to write test scenarios in the Gherkin format

For the purposes of this demo delete the contents to start fresh
At the top file type Feature: [demo feature name]
When you hit enter you should see Feature: change colour
Next enter Scenario: [demo scenario name]
Again, enter and the colour will change
Now onto the steps themselves
Enter each one of these word then enter:
Given [enter some text here, it doesn't matter what for the moment]
When [enter some text here, it doesn't matter what for the moment]
Then [enter some text here, it doesn't matter what for the moment]
And [enter some text here, it doesn't matter what for the moment]
They will change colour as you go


Now right click on the test scroll down to Run As then then click on Cucumber File
There maybe be some red the text at the top of the console, this can be safely ignored
You'll then see that the scenario has been skipped due to having undefined step, followed by some suggested code to be implemented

## Step Definitions

Copy the suggested code from the console
Right click on the package that contains the feature file and create a new class
Given the file a name (StepDefs for example)
Paste the code that copied from the console
Hover your mouse pointer over each one of the key works (Given, When, Then) and import each

Now right click on the project -> Configure -> Convert to Cucumber Project
Return to the Feature file
Hold control over one of the steps and click
The Step definition file will be opened with the correct step definition displayed
  
## Install Maven

Download maven zip file from https://maven.apache.org/download.cgi?.
Move a location other than downloads
Navigate to the bin folder within it
Copy the path
Open the Systems properties varibles
Open Eveironment variables
Select the Path variable and click edit
Add a entry and and paste the path copied earlier

Open the command Line
Type mvn
After a few seconds a Build Failure message will be displayed - This is fine, don't panic

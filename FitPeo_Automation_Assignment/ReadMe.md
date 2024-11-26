# Project Name:   Automation Analyst Assignment FitPeo


### Problem Statement
Automate the process of navigating and interacting with various elements on the FitPeo website to verify specific functionalities. This includes navigating to the Revenue Calculator page, adjusting slider values, validating displayed values, and selecting CPT codes, as well as ensuring the overall functionality of the page works as expected.

### Detailed Description
This project automates the following steps:


1.Launch the web browser and navigate to the FitPeo homepage.

2.From the homepage, navigate to the Revenue Calculator page.


3.Scroll down the page until the revenue calculator slider is visible.


4.Move the slider to set its value to 820. Verify that the associated text field is updated to reflect this value.

5.Enter the value 560 in the text field. Confirm that the slider moves to correspond to this new value.

6.Scroll down further and select checkboxes for the CPT codes:
CPT-99091
CPT-99453
CPT-99454
CPT-99474

7.Validate Total Recurring Reimbursement:

8.Verify that the header text displays the total recurring reimbursement as $110700.

### Key Automation Scope
1.Navigation and Interaction:

    navigation across multiple pages.
    Adjusts sliders and interacts with checkboxes.
Dynamic Validations:

    Verifies values displayed on the UI dynamically based on user actions.
Framework Usage:

      Utilizes Page Object Model (POM) for code modularity and maintainability.
      Integrates TestNG for test execution and reporting.
Configuration Management:

    Externalizes URLs and other hardcoded data using a properties file.
Logging and Debugging:

    Uses a logger to capture test execution details for easier debugging.
Error Handling:

    Implements exception handling to manage dynamic web elements and ensure robust execution.

### Tools and Technologies Used
- Java
- Selenium WebDriver
- Page Object Model
- Test-NG
- Extent Report
- Logger
- Screenshot
- GitHub

### Installation
1. Clone the repository to your local machine using `git clone https://github.com/your-username/identify-new-bikes.git`
2. Install the required dependencies `

### Usage
1. Run the main script `RevenueCalculatorPage.java` to Extract data and display the requirements.
2. Run `BaseClass.java`  to only launch the browser.


#HOW TO RUN 

  1.By Test-NG 
   		-RUN IT AS TESTNG SUITE USING DIFFRENT XML FILE  
   		
  2.By POM file
  		-RUN IT AS MAVEN TEST USING POM.XML FILE  
  		
  3.By Bat-File
  		-RUN using run.bat file		
  		
### Contributor
- Swaraj Gawande

### 
Thank you for checking out my project! 

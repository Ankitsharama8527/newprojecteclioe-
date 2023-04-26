Feature : login free CRM Login feature 

Scenorio Outline : free crm logi test Scenorio 

Given User is already on login page 
When  title of login page is free CrM
Then user enters "<username>" 
And user enters "<password>" 
And user click on login button
And user on home page

Example :
| username | password |
| ANKIT |  Ankit@123 |

Scenario : user is able to create a new contact
Given : user is already on home page
When : user mouse over on contacts link 
Then : user click on New Contact link 
Then : user enters firstname and lastname 
Then : user clicks on save button 
Then : verify new contact created


Feature : login Facebook login feature 

Scenorio : facebook login test 

Given : User is enter on login page 
When : title on login page is facebook 
And : user enters username and password 
And : user click on login button 
And : user enter the home page 


Feature : login makeMytrap.com login feature 

Given 


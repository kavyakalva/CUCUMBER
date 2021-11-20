Feature: Working on spreadsheet
Scenario Outline: Add details to form
Given lands on Homepage 
When clicks on corporate gift
Then enters the <FullName> <Email> <Number> <Enquiry> details
And click submit

Examples:
| FullName | Email | Number | Enquiry |
| Kavya Kalva | kavyakalva1704@gmail.com | 733273372 | hai hello |

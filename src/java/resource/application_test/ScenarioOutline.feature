Feature: Signup Functionality
Scenario Outline: Signup to application with fifferent sets of data
Given User is at the signup page
When User enters "<name>" in the form
And User enters "<age>" inside form
And User select "<gender>" in form
And User clicks on signup button
Then User gets successfully signup message

Examples:
| name | age | gender |
| Tejas | 28 | M |
| Prasad | 25 | M |
| Soham | 26 | M |
| Prachi | 30 | F |


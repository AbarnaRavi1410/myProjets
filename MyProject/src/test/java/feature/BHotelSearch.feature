Feature: Hotel Booking Automation


Scenario Outline: User searching the hotel
When User enter the following hotel information
|byvissibletext|Paris|byindex|2|byindex|2|byindex|4|
And User selects the "<checkin>" and "<checkout>" date for the hotel
And User enter adult and child per room
|byindex|2|byindex|2|
Then User searches for the Hotel
And Hotel selection page occurs

Examples:
|checkin|checkout|
|14/10/2022|14/10/23|
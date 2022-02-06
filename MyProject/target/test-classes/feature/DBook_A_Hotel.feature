Feature: Hotel Booking Automation

Scenario Outline: User Booking the hotel

When User enters "<firstname>" and "<lastname>" 
And User enters "<billing_address>" in billing_address
And User enters "<credit_card_no>" in credit_card_no
And User selects card type
|byindex|2|
And User selects card expiry month and year
|byindex|2|byvalue|2022|
And User enters the card "<credit_card_no>" and "<cvv_no>"
Then clicks on Book now
Then Booking confirmation page occurs

Examples:
|firstname|lastname|billing_address|credit_card_no|cvv_no|
|Abarna|Ravi|Prestige Bella Vista|1234567890098765|123|
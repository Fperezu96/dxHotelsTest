Feature: Book a hotel in the store
  i as user of the booking site
  want to travel to a specific place
  then i will book a hotel room

  @BookTheCheapestHotel
  Scenario Outline: Book the cheapest hotel online
    Given the user opens the booking site
    When the user is planning to travel to <place> since <checkIn> to <checkOut>
    Then should see the total <price> for reservation

    Examples:
  | place | checkIn | checkOut |  price |
  | Honolulu|02/28/2020|02/29/2020|111|
  | Las Vegas|02/25/2020|02/28/2020|270|
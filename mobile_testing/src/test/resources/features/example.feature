Feature:
  test

  Scenario: lunch App
    Given Get 'iPhone_12_Pro_Max.capabilities' capabilities from resource with JSON 'devices/device_capabilities' file and lunch 'iOS' platform
    And Check if 'app.meditopia' exists, remove it if it does and then reinstall from '/Users/testinium/Desktop/meditopia.app'
    And Rotate screen as landscape.
    And Rotate the screen as  portrait.

  Scenario: Click App
    Given Get "iPhone_12_Pro_Max_2.capabilities" capabilities from resource with JSON "devices/device_capabilities" file and lunch "iOS" platform
    And Click the "cancel_button" element if exists
    And Touch the "login_method_select_tab" and swipe down
    And Swipe left from  the "Inspiration" until reach the "Meditate_3_times"
    And Swipe right from  the "Meditate_3_times" until reach the "Inspiration"
    And Swipe left from  the "first_step" until reach the "mindful_break"
    And Swipe right from  the "mindful_break" until reach the "first_step"


  Scenario: android
      Given Get "Pixel_2.capabilities" capabilities from resource with JSON "devices/device_capabilities" file and lunch "Android" platform
      And Rotate screen as landscape.
      And Sleep for 5 milliSecond



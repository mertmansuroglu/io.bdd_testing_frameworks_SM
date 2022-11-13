Specification Heading
=====================
Created by 004577 on 18-Mar-22

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Send notification to user
----------------

* Loged in to mobil with API and stored AccessToken and RefreshToken
* Define new request
* Add base url "http://ibam-backend-test.apps.test.ocp.ibar.az"
* Add endpoint "/api/v1/notification-svc/notifications"
* Add body as file from resource "payloads/SendNotification.json"
* Add as a header "Content-Type" = "application/json"
* Add Bearer token "AccessToken"
* Post request
* Check if status code is "200"


Send notification
----------------
* Send notification
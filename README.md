# Account_Service System 개발 

Tech Stack
 - Spring boot와 Java를 활용합니다.
 - DB는 H2 DB(memory DB 모드)를 활용합니다.
 - DB를 접근하는 방법은 Spring data jpa를 활용합니다.
 - Embedded redis를 활용합니다.
 - API Request body와 Response body는 json 타입으로 표현합니다.
 - 각각의 API들은 각자의 요청과 응답 객체 구조를 갖습니다.
 - 다만, 요청을 처리하다가 실패하는 경우의 응답은 공통된 구조를 갖도록 합니다.

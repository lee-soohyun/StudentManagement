# StudentManagement Program

인프런 워밍업 클럽 2기 백엔드 미니 프로젝트

ERD 설계
![학생관리프로그램](https://github.com/user-attachments/assets/0affd9fd-2289-49e4-b80f-5b4d22637d8f)



# RestAPI 설계


> 관리자(Manager) API

|기능  | URL | Method | 
|--|--|--|
| 관리자 아이디 등록 | `/api/manager` |`POST` |
|관리자 비밀번호 등록|`/api/manager`|`POST`|
|관리자 이름 등록|`/api/manager/{manager_id}`|`POST`|
|관리자 이메일 등록|`/api/manager/{manager_id}`|`POST`|


> 공지사항(Notice) API

|기능  | URL | Method | 
|--|--|--|
| 공지사항 목록 조회 | `/api/notice` |`GET` |
|공지사항 등록|`/api/notice/{notice_id}`|`POST`|
|공지사항 수정|`/api/notice/{notice_id}`|`PUT`|
|공지사항 삭제|`/api/notice/{notice_id}`|`DELETE`|


> 학생(Student) API

|기능  | URL | Method | 
|--|--|--|
| 학생 아이디 등록 | `/api/student` |`POST` |
| 학생 비밀번호 등록|`/api/student`|`POST`|
|학생 이름 등록|`/api/student/{student_id}`|`POST`|
|학생 이메일 등록|`/api/student/{student_id}`|`POST`|
|학생 등록 일자|`/api/student/{student_id}`|`POST`|


> 수강과목(Subject) API

|기능  | URL | Method | 
|--|--|--|
| 수강과목 코드 | `/api/subject/{subject_id}` |`GET` |
|수강과목 이름|`/api/subject/{subject_id}`|`POST`|
|수강과목 강사|`/api/subject/{subject_id}`|`PUT`|
|수강과목 학점|`/api/subject/{subject_id}`|`GET`|
|수강과목 후기|`/api/subject/{subject_id}`|`GET`|


> 수강후기(Review) API

|기능  | URL | Method | 
|--|--|--|
| 수강후기 목록 조회 | `/api/review` |`GET` |
|수강후기 등록|`/api/review`|`POST`|
|수강후기 수정|`/api/review/{review_id}`|`PUT`|
|수강후기 삭제|`/api/review/{review_id}`|`DELETE`|

# codesentinel-ai Project Structure

```text
codesentinel-ai/
├── pom.xml
├── .gitignore
├── src
│   ├── main
│   │   ├── java/com/codesentinel/codesentinel
│   │   │   ├── CodesentinelAiApplication.java
│   │   │   ├── config/
│   │   │   │   └── JpaAuditingConfig.java
│   │   │   ├── controller/
│   │   │   │   └── ProjectController.java
│   │   │   ├── dto/
│   │   │   │   ├── ProjectCreateRequest.java
│   │   │   │   └── ProjectResponse.java
│   │   │   ├── entity/
│   │   │   │   └── ProjectEntity.java
│   │   │   ├── exception/
│   │   │   │   ├── ApiError.java
│   │   │   │   ├── DuplicateResourceException.java
│   │   │   │   └── GlobalExceptionHandler.java
│   │   │   ├── mapper/
│   │   │   │   └── ProjectMapper.java
│   │   │   ├── repository/
│   │   │   │   └── ProjectRepository.java
│   │   │   ├── security/
│   │   │   │   └── SecurityConfig.java
│   │   │   └── service/
│   │   │       ├── impl/
│   │   │       │   └── ProjectServiceImpl.java
│   │   │       └── ProjectService.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/java/com/codesentinel/codesentinel
│       └── CodesentinelAiApplicationTests.java
└── PROJECT_STRUCTURE.md
```

# Maven Hibernate HQL Movie Project

## Project Description

This project demonstrates the implementation of **Hibernate Query Language (HQL)** using a **Movie entity class** in a Maven-based Hibernate application.

## Technologies Used

* Java
* Maven
* Hibernate ORM
* MySQL
* Spring Tool Suite

## Database

Database Name: **fsadexam**

## Package

```
com.klef.fsad.exam
```

## Classes Implemented

1. **Movie.java**

   * Entity class with attributes:

     * id
     * name
     * date
     * status
     * genre
     * budget

2. **HibernateUtil.java**

   * Utility class for creating Hibernate SessionFactory.

3. **ClientDemo.java**

   * Inserts movie records using persistent objects.
   * Updates movie **name and status using HQL positional parameters**.

## HQL Operations Performed

* Insert movie record
* Update movie details using HQL query

## Example HQL Update

```java
String hql = "update Movie set name=?1, status=?2 where id=?3";
```

## Output

* Movie record inserted successfully
* Movie record updated using HQL

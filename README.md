### JSP and Servlet Database CRUD Application
### Java Server Pages ve Servlets Veritabanı Okuma / Yazma Uygulaması
Turkish:

Eclipse ile maven projesini içe aktarmanın yolu: File > Import > Maven > Existing Maven Project Browse > İlgili klasörün seçimi > Tamam!

Çalışan takip demo projesidir. 
MVC tasarım şablonu içerir. 
Temel CRUD operasyonları ile yapılmıştır.

English:
It is an employee tracking demo project.
Includes MVC design template.
Made with basic CRUD operations.

![Java Server Pages](jsp.png "JSP")

### Kullanılan araçlar ve teknolojiler:

1. JSP
2. Servlets
3. MVC Design Pattern / MVC Tasarım Şablonu.
4. MySQL Workbench / MySQL veritabanını kullanmamız için arayüz yazılımı.
5. Bootstrap 4 / Güzel ve gösterişli CSS / JavaScript kütüphanesi.
6. Eclipse Oxygen / Kullandığımız IDE.
7. Apache tomcat 8 / Tomcat Application Server / Tomcat uygulama sunucusu.

### Kurulum adımları.

1.Projeyi kendi bilgisayarına çek / Clone the application

```
https://github.com/huso51/java-server-pages-servlet-database-crud-application-demo.git
```

2.MySQL Veritabanı Oluşturma / Create a MySQL Database

```sql
CREATE DATABASE employee_db;
```

3.Tablo oluştur ve verileri gir. / Create a table and insert values.

```sql
create table tbl_employee(
id int primary key not null auto_increment,
name varchar(255) not null,
dob varchar(255) not null,
department varchar(255) not null
);

insert into tbl_employee(name, dob, department)values("Muhammed", "01-01-571", "Prophet");

insert into tbl_employee(name, dob, department)values("Hasan", "21-05-1992", "Testing");

insert into tbl_employee(name, dob, department)values("Veli", "23-04-1988", "Development");

insert into tbl_employee(name, dob, department)values("Salih", "18-03-1989", "Support");
```

4.
MySQL kullanıcı adını ve şifresini değiştirelim isterseniz.
Change the MySQL Username and Password as per your installation.

+ open `src/tr/com/huseyinaydin/util/DBConnectionUtil.java` file.
+ change `USERNAME` and `PASSWORD` as per your installation.

+ paketi aç `src/tr/com/huseyinaydin/util/DBConnectionUtil.java` ilgili dosyayı.
+ değiştir kullanıcı adı: `USERNAME` ve şifre: `PASSWORD` kendi kafana göre.

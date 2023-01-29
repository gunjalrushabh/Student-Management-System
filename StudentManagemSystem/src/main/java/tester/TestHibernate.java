package tester;
import static utils.HibernateUtils.getFactory;

import org.hibernate.SessionFactory;

public class TestHibernate {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory())
		{
			System.out.println("Hibernate up n running !"+sf);
		} //JVM : sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*The OUTPUT:
	 * Hibernate: 
    
    create table address_tbl (
       id bigint not null auto_increment,
        city varchar(255),
        country varchar(255),
        state varchar(255),
        zipcode varchar(255),
        student_add bigint,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table admission_tbl (
       id bigint not null auto_increment,
        admissionDate date,
        course_id integer not null,
        status varchar(255),
        student_id integer not null,
        coursejoin bigint,
        studentjoin bigint,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table course (
       id bigint not null auto_increment,
        capacity integer not null,
        course varchar(100),
        end_date date,
        fees double precision not null,
        start_date date,
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table education (
       student_id bigint not null,
        marks double precision not null,
        passingYear integer not null,
        qualification varchar(255)
    ) engine=InnoDB
Hibernate: 
    
    create table hobbies_hb (
       student_id bigint not null,
        hobby varchar(255)
    ) engine=InnoDB
Hibernate: 
    
    create table Project_students (
       project_id bigint not null,
        student_id bigint not null,
        primary key (project_id, student_id)
    ) engine=InnoDB
Hibernate: 
    
    create table projects (
       id bigint not null auto_increment,
        completed_on date,
        project_name varchar(255),
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    create table student (
       id bigint not null auto_increment,
        card_no varchar(20),
        city varchar(50),
        created_on date,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (id)
    ) engine=InnoDB
Hibernate: 
    
    alter table course 
       drop index UK_llrv1jifgjpqu8pygoktplas2
Hibernate: 
    
    alter table course 
       add constraint UK_llrv1jifgjpqu8pygoktplas2 unique (course)
Hibernate: 
    
    alter table student 
       drop index UK_jbf5xqohc9kv23srlqabvqfub
Hibernate: 
    
    alter table student 
       add constraint UK_jbf5xqohc9kv23srlqabvqfub unique (card_no)
Hibernate: 
    
    alter table address_tbl 
       add constraint FKd4ywqfjjacdpamk7u5kammvnm 
       foreign key (student_add) 
       references student (id)
Hibernate: 
    
    alter table admission_tbl 
       add constraint FKcb07lnp6jh1v5i1l0s0t3rdqf 
       foreign key (coursejoin) 
       references course (id)
Hibernate: 
    
    alter table admission_tbl 
       add constraint FKie1hox1d868g5abvy3tfil6a0 
       foreign key (studentjoin) 
       references student (id)
Hibernate: 
    
    alter table education 
       add constraint FKiaxd5dg4t8n72c7ayejmv9bky 
       foreign key (student_id) 
       references student (id)
Hibernate: 
    
    alter table hobbies_hb 
       add constraint FK46ijt4v9u0k3l5tg9usa0s3de 
       foreign key (student_id) 
       references student (id)
Hibernate: 
    
    alter table Project_students 
       add constraint FKo49t4cndie7q367do0sm1nibc 
       foreign key (student_id) 
       references student (id)
Hibernate: 
    
    alter table Project_students 
       add constraint FKihkm0niu7d2png6652gfw94yd 
       foreign key (project_id) 
       references projects (id)
Hibernate up n running !org.hibernate.internal.SessionFactoryImpl@9c93d16
	 * 
	 * */
}

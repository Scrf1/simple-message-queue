package com.scrf1.simplemessagequeue.utils;

import com.scrf1.simplemessagequeue.models.Juice;
import com.scrf1.simplemessagequeue.models.JuiceStore;
import com.scrf1.simplemessagequeue.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.EnumSet;

@Configuration
public class DatabaseUtils implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        BootstrapServiceRegistry bootstrapServiceRegistry = new BootstrapServiceRegistryBuilder().build();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder(bootstrapServiceRegistry);
        StandardServiceRegistry standardServiceRegistry = standardServiceRegistryBuilder
                .configure()
                .build();

        MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
        metadataSources.addAnnotatedClass(User.class);
        metadataSources.addAnnotatedClass(Juice.class);
        metadataSources.addAnnotatedClass(JuiceStore.class);

        Metadata metadata = metadataSources.buildMetadata();
        SchemaExport schemaExport = new SchemaExport();
        schemaExport.setFormat(true);
        schemaExport.setOutputFile("create.sql");
        schemaExport.createOnly(EnumSet.of(TargetType.SCRIPT), metadata);

        SessionFactory sessionFactory = metadata.buildSessionFactory();
        Session session = sessionFactory.openSession();

        User user = new User();
        user.setEmail("test@gmail.com");
        user.setPhone("+1 471 7411");
        user.setLastName("test");
        user.setFirstName("test");
        session.persist(user);

        JuiceStore store = new JuiceStore();
        store.setName("Juice store test");
        store.setLocation("California US");
        store.setPhone1("+1 77775 84");
        store.setEmail1("store@gmail.com");
        session.persist(store);
    }
}

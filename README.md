# ANAMS-miniatures
Group work held in the third semester of the degree in systems engineering of ISEP, within the scope of the curricular unit of Systems Analysis and Modeling. ```Final grade: 15```

This project was developed in three iterations and the utterance was as follows.

---
FIRST ITERATION
---
A company wants an application for online marketing of collection miniatures. In the future, it will expand sales to other objects/products, namely accessories (eg tyres, rims and helmets) and tools (eg magnifying glasses, sanding bits).

An unregistered user (UNR) can only consult the list of thumbnails that are marketed by the company. In case you want to make a purchase, you will have to register first. In this case, the system will ask you for the following information: full name, tax number, date of birth, telephone number and email.

It is up to the officer responsible for product management (FRP) to register thumbnails in the system. A miniature is characterized by a reference, a designation, a brand, a manufacturer identifier, a scale (eg 1:12, 1:18 and 1:43), a color, a material (eg resin , metal and wood), one year and one type (eg cars, trucks, motorcycles, planes and trains). The specification, and respective introduction in the system, of the types of commercialized miniatures is another of FRP's competences. It is also up to the FRP to associate a type of thumbnail, from the list existing in the system, to a thumbnail.

A customer (CLI) of the company, after logging in, can make purchases and consult the list of thumbnails sold by the company.

Application development must follow an iterative and incremental approach, adopting good engineering and software development practices, as well as the existence of quality supporting documentation. Furthermore, its main core must be developed in Java.

---
SECOND ITERATION
---
#### Answering open questions
1. When registering the user in the system as a customer, all requested data is mandatory. The postal address must also be requested. The email serves as the customer's identifier. After the user/customer is registered, the system should send the customer a password, which should be generated automatically, and must be unique throughout the system.
2. When browsing thumbnails, the user should be able to choose thumbnails to see more detailed information. In the base query, it is enough to show the code and the designation by thumbnail.
3. When specifying the thumbnail type, the only mandatory value is the designation. Each type must have a unique code created automatically.
4. When registering thumbnails, all requested data is mandatory. In case the thumbnail type does not exist, the system should allow the FRP to create/specify the thumbnail type. The manufacturer's reference is your email.
5. When associating a type of thumbnail to a thumbnail, its type can be changed to another one, which the FRP wants. In case the thumbnail type does not exist, the system should allow the FRP to create/specify the thumbnail type.
6. In a purchase, the system should allow the acquisition of as many miniatures as the customer wants. By miniature, the desired quantity must be requested. The date of purchase must also be requested. After making the purchase, the system should generate a bank reference and then send it to the customer by email.
7. There are several employees responsible for product management (FRP). The same applies to employees with other responsibilities.

#### New requirements
When the FRP starts querying thumbnails, the system should ask if you want to query all thumbnails or just those created/registered by FRP. 
The system should act according to the FRP response.

The scale of thumbnails must be cataloged in the system and must therefore be specified/introduced. 
The price of the thumbnail depends on its scale. 
The VAT rate must also be requested. It is up to the FRP to specify scales.

At the end of the day, the employee responsible for the orders (FRE) processes the order requests, if there are purchases in the situation of placing an order (includes payment already made and not yet associated with the order request). 
Initially, the shopping list, sorted by purchase date (from oldest to most current), should be shown to FRE. Then the FRE must select the purchase and ask for the order date.
A unique code related to the ordering order must also be generated.

The FRE is also responsible for changing the order status of an order. 
When an order is in the “ready” state, i.e., all products are available to be shipped to the customer, the customer should receive an email notification.

Finally, the system should allow recording of accessories on the platform, in addition to the thumbnails. 
Each accessory is characterized by a reference, a designation, a brand, the manufacturer's email, a price and VAT. 
The FRP is responsible for registering accessories.

Application development must follow an iterative and incremental approach, adopting good engineering and software development practices, as well as the existence of quality supporting documentation. Furthermore, its main core must be developed in Java. The application must provide user help in text format. Signals and alerts must be informed by sounds rather than just visual means. All use requires user authentication (except in situations where it does not apply, eg unregistered user). With a view to possible internationalization, the platform must make its website available in Portuguese, Spanish, French and English.

---
THIRD ITERATION
---
#### Answering open questions
1. In the thumbnail registration, if the scale does not exist, the system should allow the FRP to create/specify the scale.
2. An employee can have more than one role at the same time in the company.
3. The date of the order request must be the date of the day the order was processed, so it does not need to be requested/requested.

#### New requirements
The system should allow adding of scales to a thumbnail, among those existing in the system, and respective prices. This responsibility falls to the FRP.
In turn, the company's human resources director (DRH) needs to specify roles for employees (eg, responsible for product management, responsible for managing orders, etc.). A role is characterized by a short designation, no more than three letters, and a full designation. It is also your responsibility to register employees with the company. The necessary and mandatory information for this registration is the following: a unique code, full name, VAT number, telephone number, postal address and email.
Finally, the DRH can at any time add/associate a role to an employee. To do this, you must indicate the employee to whom you want to associate a role, choose one of the roles existing in the system and indicate the date on which the employee starts the chosen role. After adding the role, the system must immediately send the employee a notification informing him of the password to use for the new role. The password is generated internally.

**Note:** For this interaction, it is only necessary to describe in the report the functional requirements regarding the registration of new employees and to add role to a given employee. However, in the final application/prototype, all use cases covered during the three iterations must be refined/implemented.

# S-RAMP Integration Tests

This module contains a robust suite of integration tests, based on Arquillian and runnable on multiple S-RAMP-supported platforms.  The real S-RAMP installer is run against the target platform, Arquillian runs it in a "managed mode", and the tests operate purely "as-client".  All that is to say that the environment is *real world*.  To run the tests:

- Tomcat 7: mvn clean test -P tomcat-integration-test<br/>
*Note: Automatically downloads the Tomcat distro*
- EAP 6.3: mvn clean test -P eap63-integration-test<br/>
*Note: Requires that jboss-eap-6.3.0.zip exists in the project root*
- EAP 6.2: mvn clean test -P eap62-integration-test<br/>
*Note: Requires that jboss-eap-6.2.0.zip exists in the project root*
- EAP 6.1: mvn clean test -P eap61-integration-test<br/>
*Note: Requires that jboss-eap-6.1.0.zip exists in the project root*

FROM openjdk          
EXPOSE 9094
ADD target/Demo-4-0.0.1-SNAPSHOR.jar cicd.jar
ENTRYPOINT [ "java","-jar","cicd.jar" ]
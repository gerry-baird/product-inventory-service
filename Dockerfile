FROM registry.access.redhat.com/ubi8/openjdk-11:latest

COPY target/product-inventory-service-1.0.jar /deployments/product-inventory-service-1.0.jar
FROM airhacks/payara
COPY ./target/conneg.war ${DEPLOYMENT_DIR}

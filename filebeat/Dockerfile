ARG ELK_VERSION
FROM elastic/filebeat:${ELK_VERSION}
COPY config/filebeat.yml /usr/share/filebeat/filebeat.yml
USER root
RUN chown root:filebeat /usr/share/filebeat/filebeat.yml
RUN chmod go-w /usr/share/filebeat/filebeat.yml
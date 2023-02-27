ARG ELK_VERSION
FROM elastic/auditbeat:${ELK_VERSION}
COPY config/auditbeat.yml /usr/share/auditbeat/auditbeat.yml
USER root
RUN chown root:auditbeat /usr/share/auditbeat/auditbeat.yml
RUN chmod go-w /usr/share/auditbeat/auditbeat.yml
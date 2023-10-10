# Use the official NGINX image as the base image
FROM nginx

# Copy the contents of the 'static' folder into NGINX's default web directory
COPY ./paperless-ngx-dev/src-ui/src /usr/share/nginx/html/

# Expose port 80 to allow incoming traffic
EXPOSE 80
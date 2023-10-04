# Use a lightweight Node.js image as the base image
FROM node:14

# Set the working directory in the container
WORKDIR /app

# Copy the entire AngularJS project to the container
COPY ./paperless-ngx-ui ./app

# Install a simple web server
RUN npm install -g http-server

# Expose port 80 for the web server
EXPOSE 80

# Start the web server to serve the AngularJS app
CMD ["http-server", "--port", "80"]
import requests

url = "http://www.example.com"
response = requests.get(url, headers={'Cache-Control': 'max-age=3600'})

print(response.text)


# In Python, client-side caching can be implemented using the requests module, which provides a simple interface for working with HTTP requests. The following code snippet demonstrates how to use the requests module to perform a GET request and cache the response

# the max-age directive is used to specify that the response should be cached for one hour. This tells the client to use any cached response if available instead of making a new request to the server.

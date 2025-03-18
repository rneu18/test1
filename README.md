# test1
1. This project has 3 additional modules along with app.
2. From app level, we just want to call composable in hiring-android module
3. Most of the required dependencies are already added in the respective modules
4. Basic UI has been already build in hiring-android module
5. ViewModel class is also been built and it needs to get data from repository (domain module)
6. There is hiring-domain module and has repository which needs proper implementation
7. Hiring-domain module has Service interface and Retrofit class which are also need to be properly implemented

# Task
Call the given api (below) and display name vertical scrollable list.
1. You will first display all data without filtering
2. You will display only data where name is not null or name is not empty
3. You will display data where name is not null and also replace empty name with "NA for {item}"
4. You will group data based on listId

# if we get time
1. Add Unit test for repository and viewModel
2. Create a SharedFlow variable in repository to emit the response on it and collect it in viewModel

## Note
Feel free to ignore any existing code and write your own code if you think that will be more comfortable for you.




Api endPoint: https://fetch-hiring.s3.amazonaws.com/hiring.json

## Set Operations Challenge - Task Class
You'll need to create a class that represents a Task.

It should have
- an <b>assignee</b>.
- a <b>project</b> name.
- a task <b>description</b>.
- a <b>status</b> (assigned, in progress, or not yet assigned).
- a <b>priority</b>, High, Low, or Medium.
Each of these attributes should be <b>editable.</b>

A task is uniquely identified by its project name and description.

The task should implement Comparable, so that tasks are sorted by project name and description.

## Set Operations Challenge - TaskData Class
The TaskData class will be used to set up and return some test data.

If you want to use my data, it can be found in a CSV file in the resources section of this video, and consists of the following:
- All tasks identified by the manager.
- Tasks identified by Ann, that she's working on or plans to work on.
- Tasks which Bob says have been assigned to him.
- Tasks Carol is doing, as reported by herself.
This class should have a getTasks method, that returns a Set of Task. This method should take a String, either the name of one of the employees to get a specific Set, or 'all' to get the full task Set.

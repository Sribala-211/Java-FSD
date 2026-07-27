\# Git Branching and Merging



\## Objectives



\- Explain branching and merging.

\- Explain creating a branch request in GitLab.

\- Explain creating a merge request in GitLab.



\## Hands-on Performed



\### Branching



1\. Created a new branch:

&#x20;  ```bash

&#x20;  git branch GitNewBranch

&#x20;  ```



2\. Listed all branches:

&#x20;  ```bash

&#x20;  git branch

&#x20;  ```



3\. Switched to the new branch:

&#x20;  ```bash

&#x20;  git checkout GitNewBranch

&#x20;  ```



4\. Created `branch.txt`.



5\. Added and committed the file:

&#x20;  ```bash

&#x20;  git add .

&#x20;  git commit -m "Added branch.txt in GitNewBranch"

&#x20;  ```



\### Merging



1\. Switched back to master:

&#x20;  ```bash

&#x20;  git checkout master

&#x20;  ```



2\. Compared the branches:

&#x20;  ```bash

&#x20;  git diff master GitNewBranch

&#x20;  ```



3\. Merged the branch:

&#x20;  ```bash

&#x20;  git merge GitNewBranch

&#x20;  ```



4\. Viewed commit history:

&#x20;  ```bash

&#x20;  git log --oneline --graph --decorate

&#x20;  ```



5\. Deleted the merged branch:

&#x20;  ```bash

&#x20;  git branch -d GitNewBranch

&#x20;  ```



6\. Pushed the changes:

&#x20;  ```bash

&#x20;  git push origin master

&#x20;  ```



\## Files



\- `branch.txt`

\- `README.md`



\## Result



Successfully created, merged, and deleted a Git branch and pushed the changes to GitHub.


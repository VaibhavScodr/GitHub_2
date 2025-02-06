# GitHub_2
25. To connect the init local repo to the github use command <h3>git remote origin main</h3>
26. .gitignore is filewhich takes the forcefilly untracked files <br>
27. <h3>Day3</h3> <br>
28. Here we have to see that how can we use git repo or create from the local machine itself <br>
29. <pre>
    1. git init
    2. git add README.md
    3. git commit -m "must do it"
    4. git branch -M main <---this is needed to do >   
    5. git remote add origin main <url>
    6. git push -u origin main
</pre> 
30. Now if you change or add a file directaly to the github then this will be one commit ahead from the local git so for this we use and in this no push operation can be performed <br>
31. <pre>
       1. git pull origin main
       2. git add file.name
       3. git commit -m ""
       4. git push origin main
</pre>
32. and another way to that is <br>
33. <pre>
      1. git fetch origin
      2. git merge origin/main
      3. git push origin main
      
</pre>
34. GitHub fork <br>
35. used for copying the repo in my remote github ok not in my locaal machine <br>
36. in fork <h3>we use fork option in the github</h3> then we clone it in the local repo. <br>
37. Now it comes to modification of file modified --> staged --> commited. <br>
38. Now for making and after pushing changes to origin it will reflect on the github but to make it changes real we use <h3>Pull Request</h3>. <br>
39. owner can review it or than he can accept it or reject it request. <br>
40. <h3>Dya4</h3> <br>
41. Now see the Git rebase master so see this --> <img link="https://phoenixnap.com/kb/wp-content/uploads/2023/03/git-rebase-example.png" alt="rebase">
42. <pre>
    1. make a file in local make commit not push.
    2. make a same file using github.
    3. now pull it's changes from git.
    4. now do <h1>git rebase origin main</h1>
    5. now everything will be up to date. 
</pre>
43. Interview question is merge/rebase ans is the rebase has no new commites and merge has new commites and changes and the multiple people working on the rebase so i will be currepted so for team it is not suitable but merge is absolutely used for the merge. 

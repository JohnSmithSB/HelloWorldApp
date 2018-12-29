class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Prints the string to the console. Change from Patch branch
    }
}
// Some more comment Yet anothe change from Feature N
// Some changes for testing commit history rewriting A change from Feature N afrter parch merge
// Further changes in branch ertert Modify one line
//wertewrtert
// Add one line

Collaborator can't correctly proceed commits reordering in pull request.
*Steps:*
# create integration for some github repo
# add two simple commits in branch A: c1 and c2
# create pull request A -> master
# open collaborator review for PR
# in repo branch A reorder two last commits from step two
{noformat}git rebase -i HEAD~2{noformat}
in editor change commits order and save
from this:
{noformat}pick c1 first
pick c2 second{noformat}
to this:
{noformat}pick c2 second
pick c1 first{noformat}
{noformat}git push -f origin A {noformat}
# review materials in PR review from step 4 fall in incorrect state (screenshot is attached)

*Current behavior:*
* commits order in review materials is not changed
* review materials contains changes only from commit c2
* in diff viewer simple display modes, except the Custom one, presents PR changes only from commit c2 (in custom mode commit c1 can be correctly displayed)

*Expected behavior:* correct presentation of new commits set in review materials and diff viewer

dirjfsoi poewirt ;poewirpt ikpoewrtp oipeort i

**Code Challenge: Gibberish Generator**
---------------------------------------

Challenge Overview
------------------

**Your response to this challenge can be used to supplement your SWEAP application.  If you plan to complete this challenge for SWEAP, ensure you meet the other minimum requirements by visiting [here](http://gecapital.com/sweap "SWEAP Home Page").  Whether you apply or not, you are welcome to fork this repository and complete as a personal project challenge.**


We are exticed taht you are intsereted in joiinng the Soawtfre Engreeniing Appsecitnerhip Prargom.  Weoclme to yuor fsrit prommarging chanellge.  Yuor chnellage is to courtsnct a prrgoam taht tekas an Enilgsh txet snirtg as iupnt and rerutns rebadale giirebbsh lkie tihs.  It dseno’t mtaetr in waht oerdr the ltteres in a wrod are, but an iproamtnt tihng is taht the frsit and lsat ltteer be in the rghit pclae. The rset can be a taotl mses and you can sitll raed it whotuit a pboerlm.  Tihs is bcuseae the huamn mnid deos not raed ervey lteter by istlef, but the wrod as a wlohe.

**The Basics:**
  
  - You may use *almost any* programming language... it's your choice.  See the supported options [here](http://ideone.com/).
  - Your program should leave the first and last letter of each word in place and scramble the rest.
  - Your program should not scamble punctuation (.,-'...etc.), numbers, or upper-case abbreviations.
  - For example gibberish, see the [/textfiles](https://gitlab.cs.uno.edu/sweap/gibgen/tree/master/textfiles) folder.  Two sample output files are provided: `xxx.txt.gib`

**Input/Output:**
 
  - Name your program as follows: `gibgen.xx` (where xx is variable based on the language you choose)
  - Your program should be able to read text input from a string passed into STDIN
      - `gibgen.xx "This is a String"`
      - `cat mystringfile.txt | gibgen.xx`
  - Your program should output to the console.

_Note: This challenge is based on a popular word gibberish meme. You can improve the readability by looking at a [researcher's take](http://www.mrc-cbu.cam.ac.uk/people/matt.davis/cmabridge/) on the truths/myths of this meme, but this is not required._

What to do
----------
1. [Download](http://git-scm.com/downloads) & install Git on your machine

2. <a href="https://gitlab.cs.uno.edu/sweap/gibgen/fork" class="btn grouped" data-method="POST" rel="nofollow" title="Fork">Fork</a> this project - Go [here](https://gitlab.cs.uno.edu/sweap/gibgen) and click the "Fork" button (located on the upper-right side of the screen)

2. Clone your new fork'd repository to your local machine - `git clone https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen.git`
3. Complete the code challenge and fill out the Quick Start & Questions in the the README (see below)
4. `git add` and `git commit` your local repository as you go
4. Push your code and README back to UNO's GitLab occasionally - `git push origin master`
5. Email [serp@ge.com](mailto:serp@ge.com) with the Commit URL to your fork'd repository that you want reviewed. It should include at least 2 files: (1) your updated README with Coding Questions answered, and (2) your program (gibgen.xx)
   - Grant the "SWEAP" user "MASTER"-level access to your repository by going here `https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen/team` and clicking the "New Team Member" button.
   - Then go here: `https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen/commits/master`
   - Find the commit that you'd like us to review.  _The commit date must be on or before 11:59pm (central) on Nov-10!_
       - Click the "Browse Code ->" link for that commit
   - Copy and paste the URL into the email along with your name... it should look something like this:
       - `https://gitlab.cs.uno.edu/YOUR_USERNAME_HERE/gibgen/tree/73afe0c8fe2...hash.hash...e80afea72b6`

_Note: If you have any questions, email [serp@ge.com](mailto:serp@ge.com).  I will do my best to respond to any questions Saturday & Sunday evening._

Judging Criteria
----------------

Your responses to the **Coding Questions** at the bottom of this README are the *Most Important* part of this challenge. A working, fully fault-tolerant program that we just can't break, albeit awesome, is the least important.  Why is that?  Remember, we don't expect you to be expert programmers (just yet)... We want to see how you think through a problem.  


For completion by applicant
===========================

Quick Start
-----------

* I used Git Bash to run my Java code.  command line entered: java Gibgen "textfiles/capital.txt".  
* Dr Java.
* Pretty basic.  I hope this gibberish is the gibberish desired.  Had trouble with hyphenated words.


Coding Questions- Paul Montelepre(2187693)
----------------

Question 1: "How did you approach the problem?" (500 words or less)

First thing is to decide what I want my solution to be, then I draw the steps to getting my program to that solution.  This helps me get an understanding of what direction my program should take.  The first coding I always do is start pseudo-code and work back by making more and more revisions with actual code replacing my pseudo-code.  
I first constructed a Scanner and linked it to a Filebuilder for its input.  Then I decided to manipulate and print the tokens one at a time.  Next decisions were that only lowercase characters will be moved and that only words with a length greater than four will be changed.  Next I set the loop for the actual replacing/shifting and its boundaries.  Following that, I changed this former loop to set a base to deal with punctuation at the beginning of each token.  The length also had to be adjusted for punctuation at the end of the tokens so that was next.  Lastly, I wrote a static main program so I could set control flow of starting the getString() method.  
Since anything that is not a lowercase letter is anchored and the first and last letters of all the incoming tokens are ignored – the conditions seem to be met.


Question 2: "What was the most difficult aspect of the solution?" (500 words or less)

The major trouble I was running into was the difference in the instructions.  The read.me.txt file states “Your program should not scramble punctuation (.,-'...etc.), numbers, or upper-case abbreviations.”  My first program completed just that; but I then looked at the sample data that was supplied with the criteria.  The hyphened-words became two different words.  My program treats hyphened words as one word but the hyphen is anchored in place, as is anything that is not a lowercase letter.  This still allows for easy readability by the human mind but might not be what was intended by the supplemental exercise.  I believe that hardest part of a solution is figuring out what solution you want and tailoring your program to do just that.  
	I noticed this rather late on Sunday and did not have time to fix.  One way would be to set a sub-length(int) when a hyphen is encountered and manipulate the sub-length.  Keep doing this until all the sub-lengths equal the actual length. 

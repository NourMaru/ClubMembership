# ClubMembership

This is a basic membership management program for a fitness centre. 

This fitness centre has three outlets: Club Mercury, Club Neptune, and Club Jupiter.
It also has two types of members: Single Club Members and Multi Club Members.

A single club member has access to only one of the three clubs. 
A multi club member, on the other hand, has access to all three clubs.

The membership fee of a member depends on whether he/she is a single club or a multi club member. 
For single club members, the fees also depend on which club he/she has access to.
Finally, multi club members are awarded membership points for joining the club. 
Upon sign up, they are awarded 100 points which they can use to redeem gifts and drinks from the store. 

This application does not handle the redemption process. All that it does is add 100 points to the multi club member’s account.
This application uses a csv file to store information about each member.
Whenever we launch the application, we’ll read the information from the csv file and transfer it to a LinkedList. 
When we add a member to the LinkedList or remove a member from it, we’ll update the csv file.

This application consists of six classes and one interface as shown below:

	Classes:
		Member
		SingleClubMember extends Member
		MultiClubMember extends Member
		MembershipManagement
		FileHandler
		Java Project

	Interface:
		Calculator

# Property-Flooding
COMP-3220 Group Project Phase 2 (Elaboration Iteration 1)
This repository contains the code that loads data from a .csv file downloaded from the City of Windsor's open dataset about Community Centre locations. Once the data is loaded, it is displayed and can be accessed for different applications. 
One application implemented in this repository is asking the user to enter a street name to show them the history of Flood service requests received by the City of Windsor in the past 5 years.  This is done by searching the records loaded from the open dataset available on the City of Windsor website.  

Here is a brief discerption of some of variables used in this code:

- CSV file: is a sequential text file is comma delimited with a number of fields, each files has its own data type. It can be int, double, string, or anything thing else.

- Record:  is one row or line in the loaded CSV file, a record has fields, each field has a type, like int, String, etc.

- Floods:  is a list of records in memory.

- stFlood:  is an instance of street that will initiate the search when the user select option 2.

The documentation repository for this project can be found at http://www.noor112.myweb.cs.uwindsor.ca/property-flodding-grading-dataset/

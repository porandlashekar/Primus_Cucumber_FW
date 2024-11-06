
 #@branch  
       #We can declare @tag here but Whenever we want to execute 
               #specified tag(scenario) it will not workout for that
                    #it will execute the all scenarios in the feature file
 Feature: 
  As Admin validates Branches Module

 @Branch
  Scenario Outline: 
    Validate Add Branches with multiple data and Branch deletion

    Given launch Browser
    When launch url "http://primusbank.qedgetech.com/" in a browser
    When wait for username with "xpath" and "//input[@id='txtuId']"
    When Enter username with "xpath" and "//input[@id='txtuId']" and "Admin"
    When Enter password with "xpath" and "//input[@id='txtPword']" and "Admin"
    When click Login button with "xpath" and "//input[@id='login']"
    When click branch link with "xpath" and "//a[@href='admin_banker_master.aspx']"
    When wait for newbranch with "xpath" and "//input[@id='BtnNewBR']"
    When click on NewBranch link with "xpath" and "//input[@id='BtnNewBR']"
    When wait for BranchName with "xpath" and "//input[@id='txtbName']"
    When Enter in "<BranchName>" with "xpath" and "//input[@id='txtbName']"
    When Enter in "<Address1>" with "xpath" and "//input[@id='txtAdd1']"
    When Enter in "<Zipcode>" with "xpath" and "//input[@id='txtZip']"
    When user Select "<CountryList>" with "xpath" and "//select[@id='lst_counrtyU']" 
    When user Select "<StateList>" with "xpath" and "//select[@id='lst_stateI']"
    When user Select "<CityList>" with "xpath" and "//select[@id='lst_cityI']"
    When click Submit button with "xpath" and "//input[@id='btn_insert']"
    When accept alert Ok
    When click DeleteIcon with "xpath" and "(//img)[11]"
    When click delete Ok
    When accept delete alert Ok
    When user Select CountryList with "xpath" and "//select[@id='lst_countryS']" and "INDIA"
    When user Select StateList with "xpath" and "//select[@id='lst_stateS']" and "Andhra Pradesh"
    When user Select CityList with "xpath" and "//select[@id='lst_cityS']" and "Hyderabad"
    When click on search button with "xpath" and "//input[@id='btn_search']"
		When close browser    

    Examples: 
      | BranchName | Address1 | Zipcode | CountryList | StateList | CityList|
     # | Developer  | Lb nagar |   50820 | INDIA | Andhra Pradesh | Hyderabad |
    #  | Tester     | Lb nagar |   50821 | INDIA | MAHARASTRA | 	MUMBAI | 
     # | Assistance | Lb nagar |   50822 | INDIA | Andhra Pradesh | secundarabad |
     # | Dilsukhnagar | near Konark theatre |   50823 | INDIA | Andhra Pradesh | secundarabad |
      | Nampally | Railway station |   50824 | INDIA | Andhra Pradesh | secundarabad |
    
    
      
  @Roles
  Scenario Outline:
		Validates New role creation with valid data
		
		Given launch Browser
    When launch url "http://primusbank.qedgetech.com/" in a browser
    When wait for username with "xpath" and "//input[@id='txtuId']"
    When Enter username with "xpath" and "//input[@id='txtuId']" and "Admin"
    When Enter password with "xpath" and "//input[@id='txtPword']" and "Admin"
    When click Login button with "xpath" and "//input[@id='login']"
    When click Roles link with "xpath" and "//img[@src='images/Roles_but.jpg']"
    When wait for NewRole with "xpath" and "//input[@name='btnRoles']"
    When click on NewRole link with "xpath" and "//input[@name='btnRoles']"
    When wait for RoleName with "xpath" and "//input[@name='txtRname']"
    When Enter in "<roleName>" with "xpath" and "//input[@name='txtRname']"
    When Enter in "<RoleDescription>" with "xpath" and "//input[@name='txtRDesc']"
    When user Select "<RoleType>" with "xpath" and "//select[@name='lstRtypeN']" 
    When click Submit button with "xpath" and "//input[@name='btninsert']"
    When close browser 
    Examples: 
      | roleName | RoleDescription | RoleType |
     # | Manager  | Manage all Transactions |  E |
      #| Cashier  | Deals with Cash dispense | C | 
      | Assistance | Helps for Customers s|   E | 
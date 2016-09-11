#EtsyJavaApi

Etsy Java Api lets you configure oauth and make api calls based on the Etsy Api Framework.
Making call request and reading responses has never been easier. After you have configured your etsy service file you can simply build the object your looking for and add it with a simple method call. Will be working on adding the functionality for all method calls, some need tweaking.

#Example 
		//Create a listing item, note by default we put items in a draft state unless you change it.
		Listing draft = new Listing();
		//Enter all required data for processing
		draft.setPrice("0.20");
		draft.setQuantity(new Double("0.0"));
		draft.setTitle("do not use");
		draft.setWhen_made("2010_2016");
		draft.setWho_made("i_did");
		draft.setDescription("fake");
		//Existing shipping template is needed
		draft.setShipping_template_id(new Long("18656190424"));
		//Here is where the magic happens and using scribe we can push a new listing to the etsy server.
		draft.createListing();

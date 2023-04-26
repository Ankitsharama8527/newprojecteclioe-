package testRunner;

    @RunWith(Cucumber.class)
    @cucumberOptions(
    		features = "C:\Users\Ankit\eclipse-workspace\CucumberB\src\main\java\feature\login.feature"
    		.glue = {"stepdef"},
    		monochrome = true,
    		strict = true,
    		DryRun = false
    		)
    	
    
    
public class myrunner {

}

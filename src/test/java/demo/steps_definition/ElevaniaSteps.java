package demo.steps_definition;

import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import demo.pages.base.page_object.Elevania;

public class ElevaniaSteps {

    Elevania elevania = new Elevania();

    @Given("user skip pop up banner")
    public void userSkipPopUpBanner() {
        elevania.popUpBannerClose();
    }

    @And("user type on search bar {string}")
    public void userTypeOnSearchBar(String product) {
        elevania.inputKomputer(product);
    }

    @Then("user choose best product")
    public void userChooseBestProduct() {
        elevania.clickBestProduct();
    }

    @And("user choose the first product")
    public void userChooseTheFirstProduct() throws InterruptedException {
        elevania.clickFirstProduct();
    }

    @Then("user can see the details of product")
    public void isSeeDetailsProduct() {
        Assert.assertTrue(elevania.isTheDetailsOfProductShow());
    }

    @And("user add item {string}")
    public void userAddItem(String item) {
        elevania.addItem(item);
    }

    @And("user choose add to cart")
    public void userChooseAddToCart() {
        elevania.addToCart();
    }

    @And("user choose ya on confirmation page")
    public void userChooseYa() {
        elevania.chooseYa();
    }

    @Then("user can see the details of cart")
    public void isSeeDetailsOfCart() {
        Assert.assertTrue(elevania.isTheDetailsOfCart());
    }

    @And("user choose change kurir")
    public void userChooseChangeKurir() {
        elevania.changeKurir();
    }

    @And("user choose cancel")
    public void userChooseCancel() {
        elevania.chooseCancel();
    }

    @And("user choose delete product")
    public void userChooseDeleteProduct() {
        elevania.chooseDelete();
    }

    @And("user choose ok delete")
    public void userChooseOkDelete() {
        elevania.chooseOkDelete();
    }

    @Then("user can see empty product on the shopping cart")
    public void userSeeTheEmptyProduct() {
        Assert.assertTrue(elevania.isTheProductEmpty());
    }

}

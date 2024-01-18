import * as home from '..\\cypress\\pages\\HomeExport';

describe("testing home page", () => {

    beforeEach("should visit home page" , () => {
        home.visitUrl()
    })


    it("should search for a product", () => {
        home.typeSearchInput("iphone")
        home.clickSearchButton()
    })
})
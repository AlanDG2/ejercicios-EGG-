import  HomeClass from '..\\cypress\\pages\\HomeClass'


describe("testing home page", () => {
    beforeEach("should visit home page" , () => {
        HomeClass.visitUrl()
    })

    it("should search for a product", () => {
        HomeClass.typeSearchInput("iphone")
        HomeClass.clickSearchButton()
    })
})
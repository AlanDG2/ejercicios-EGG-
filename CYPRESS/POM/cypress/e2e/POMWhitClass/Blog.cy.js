import BlogClass from '..\\cypress\\pages\\BlogClass'

const blog = new BlogClass()

describe("testing blog page", () => {
    beforeEach(() => {
        blog.visit()
    })

    it("should visit the blog page", () => {
        cy.title().should("eq", "Blog - Poco theme")
    })

    it("should have correct category names", () => {
        blog.getFirstCategoryButton().should("contain.text", "Business")
        blog.getSecondCategoryButton().should("contain.text", "Electronics")
        blog.getThirdCategoryButton().should("contain.text", "Technology")
    })
})



export const constructor = () => {
    return title = "Blog"
}   

export const visit = () => {
    return cy.visit("/index.php?route=extension/maza/blog/home")
}

export const getFirstCategoryButton = () => {
    return cy.get("#entry_210963 > div > a:nth-child(1)")
}

export const getSecondCategoryButton = () => {
    return cy.get("#entry_210963 > div > a:nth-child(2)")
}

export const getThirdCategoryButton = () => {
    return cy.get("#entry_210963 > div > a:nth-child(3)")
}

export const getPreviousBlogsButton = () => {
    return cy.get("#mz-article-listing-76210960 > div.mz-tab-listing-header.d-flex > div > div > a.mz-swiper-nav-prev.swiper-button-disabled")
}

export const getNextBlogsButton = () => {
    return cy.get("#mz-article-listing-76210960 > div.mz-tab-listing-header.d-flex > div > div > a.mz-swiper-nav-next")
}


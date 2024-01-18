describe('Suite de pruebas para sitio de comercio electrónico', () => {
    before(() => {
      // Acciones que se ejecutarán una vez antes de todas las pruebas
      // Por ejemplo: cy.visit('https://www.ecommerce-example.com')
    });
  
    beforeEach(() => {
      // Acciones que se ejecutarán antes de cada prueba
      // Por ejemplo: Limpiar el carrito de compras, iniciar sesión, etc.
    });
  
    afterEach(() => {
      // Acciones que se ejecutarán después de cada prueba
      // Por ejemplo: Cerrar sesion, limpiar datos temporales, etc.
    });
  
    after(() => {
      // Acciones que se ejecutarán una vez después de todas las pruebas
      // Por ejemplo: Realizar una limpieza final, cerrar la sesión, etc.
    });
  
    // Especificación 1
    context('Funcionalidades de búsqueda y navegación', () => {
      beforeEach(() => {
        // Acciones específicas para esta especificación
      });
  
      it('Buscar un producto específico', () => {
        // Prueba para buscar un producto y verificar resultados
      });
  
      it('Navegar por las categorías de productos', () => {
        // Prueba para navegar por diferentes categorías de productos
      });
    });
  
    // Especificación 2
    context('Funcionalidades de compra y pago', () => {
      beforeEach(() => {
        // Acciones específicas para esta especificación
      });
  
      it('Agregar productos al carrito de compras', () => {
        // Prueba para agregar productos al carrito
      });
  
      it('Realizar el proceso de pago', () => {
        // Prueba para completar el proceso de pago
      });
    });
  
    // Más pruebas...
  });
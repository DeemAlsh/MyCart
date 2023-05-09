//TODO: Add the contents of the order class

export class Order {
    address: string;
    creditCart:string;
    id: number;
    name: string;
    total: number;


    constructor() {
      this.id = 0;
      this.name = '';
      this.total = 0;
      this.address = '';
      this.creditCart = '';
    }
  }

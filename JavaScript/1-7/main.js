class Taiyaki {
  constructor(taste) {
    this.taste = taste;
  }
  content() {
    console.log('中身は'+this.taste+'です');
  }
}

let Anko = new Taiyaki('あんこ');
Anko.content();
let Cream = new Taiyaki('クリーム');
Cream.content();
let Cheese = new Taiyaki('チーズ');
Cheese.content();
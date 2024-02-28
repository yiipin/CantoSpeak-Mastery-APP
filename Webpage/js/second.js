var mySwiper = new Swiper(".swiper-container", {
  // Optional parameters
  // 預設值是derection: 'horizonral，所以拿掉vertical就變水平'
  //direction: 'vertical',
  derection: "horizonral",
  //是否重複播放
  loop: true,
  //速度
  speed: 1500,

  //If we need Auto Play
  autoplay: {
    delay: 3000
  },

  //If we want to change effect
  effect: "slide",

  // If we need pagination
  pagination: {
    el: ".swiper-pagination"
  },

  // Navigation arrows
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev"
  }
});

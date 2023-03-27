package test;

import java.util.Scanner;

public class Game {
        Scanner scan = new Scanner(System.in);

        int playWinCount = 0;
        int computerWinCount = 0;
        int drawCount = 0;
        int per = 0;
        int pc = 0;
        /*
            游戏开始
         */
        public void start() {
            /*
             * 猜拳游戏 0----石头 1----剪刀 2----布 ，玩家通过输入一个0---2的数字表示玩家出拳
             * 电脑通过系统随机生成一个0--2的数表示电脑出拳
             * 思考：计算出玩家赢还是电脑赢，并提示。（处理玩家的错误输入）
             */
            System.out.println("***************************************************");
            System.out.println("                 欢迎进入猜拳游戏                     ");
            System.out.println("***************************************************");
            do {
                player();
                computer();
                win();
                System.out.println("是否继续？Y/N");
            }while("Y".equalsIgnoreCase(scan.next()));
            showResult();
        }
        /*
            玩家出招
         */
            public void player() {
                System.out.println("猜拳游戏：0----石头,1----剪刀,2----布 请在下方输入你的出拳:");
                per = scan.nextInt();
                switch(per) {
                    case 0:
                        System.out.println("您出的是：石头");
                        break;
                    case 1:
                        System.out.println("您出的是：剪刀");
                        break;
                    case 2:
                        System.out.println("您出的是：布");
                        break;
                    default:
                        System.out.println("您的输入不正确！请重新输入！");
                        player();
                }
            }

            /*
                电脑出招
             */
            public void computer() {
                pc = (int)(Math.random()*3);        //随机生成0 1 2
                switch(pc) {
                    case 0:
                        System.out.println("电脑出的是：石头");
                        break;
                    case 1:
                        System.out.println("电脑出的是：剪刀");
                        break;
                    case 2:
                        System.out.println("电脑出的是：布");
                        break;
                }
            }
            /*
                判断输赢
             */
            public void win() {
                boolean flag = true;
                    if (flag == true) {
                        if (per == pc) {
                        drawCount++;
                        System.out.println("这是一个平局哦！");
                }
                  else if (per == 0 && pc == 1 || pc == 1 && pc == 2 || per == 2 && pc == 0) {
                        playWinCount++;
                        System.out.println("恭喜你，你赢了！");
                } else {
                    computerWinCount++;
                    System.out.println("你输了,请再接再励！");
                }
            }
        }

        /*
            显示最终结果
         */
        public void showResult() {
            System.out.println("电脑一共赢了" + computerWinCount + "次");
            System.out.println("您一共赢了" + playWinCount + "次");
            System.out.println("平局" + drawCount + "次");
    }

        public  static  void  main(String[] args) {
            Game game = new Game ();
            game.start();
        }

}

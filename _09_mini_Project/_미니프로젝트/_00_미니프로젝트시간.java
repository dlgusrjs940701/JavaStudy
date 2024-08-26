package _09_mini_Project._미니프로젝트;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class _00_미니프로젝트시간 {

    private static final int TIME_LIMIT = 3000; // 3초 (3000 밀리초)

    public static void main(String[] args) {
        int x, y, z;
        int answer; // 정답
        int score;
        boolean play, retry;

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // 아이디, 점수 저장 배열
        String[] ids = new String[3];
        int[] scores = new int[3];

        for (int j = 0; j < 3; j++) {
            retry = true;
            while (retry) {
                score = 0;
                play = true;
                System.out.println("구구단 게임을 실행합니다...");
                System.out.println("아이디를 입력하세요...");
                ids[j] = in.nextLine();
                System.out.println("[" + ids[j] + "] 확인.");

                while (play) {
                    for (int i = 0; i < 7; i++) {
                        x = random.nextInt(9) + 1;
                        y = random.nextInt(9) + 1;
                        answer = x * y;
                        System.out.println();
                        System.out.println(x + " X " + y + " = ??");

                        Timer timer = new Timer();
                        long startTime = System.currentTimeMillis();
                        TimerTask task = new TimerTask() {
                            @Override
                            public void run() {
                                System.out.println("시간 초과!");
                            }
                        };
                        timer.schedule(task, TIME_LIMIT);

                        int userAnswer1 = -1;
                        Thread inputThread = new Thread(() -> {
                            try {
                                userAnswer = in.nextInt();
                            } catch (Exception e) {
                                // 입력 오류 처리
                            } finally {
                                timer.cancel();
                            }
                        });
                        inputThread.start();
                        try {
                            inputThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        long endTime = System.currentTimeMillis();
                        long elapsedTime = endTime - startTime;

                        if (userAnswer1 == -1) {
                            System.out.println("정답: " + answer);
                            System.out.println("점수: " + score);
                            System.out.println("시간: " + (elapsedTime / 1000.0) + "초 (시간 초과)");
                            score -= 15;
                        } else if (userAnswer1 == answer) {
                            System.out.println("정답");
                            score += 30;
                            System.out.println("점수: " + score);
                        } else {
                            System.out.println("오답");
                            score -= 15;
                            System.out.println("점수: " + score);
                        }
                    }

                    if (score >= 150) {
                        System.out.println("대단합니다! 다음 단계로 넘어가겠습니다!");
                        System.out.println("다음 단계로 넘어가시려면 아무키나 입력하세요...");
                        in.nextLine(); 
                        in.nextLine(); 

                        int userAnswer;
						for (int i = 0; i < 7; i++) {
                            x = random.nextInt(9) + 1;
                            y = random.nextInt(9) + 1;
                            z = random.nextInt(9) + 1;
                            answer = x * y * z;
                            System.out.println();
                            System.out.println(x + " X " + y + " X " + z + " = ??");

                            Timer timer = new Timer();
                            long startTime = System.currentTimeMillis();
                            TimerTask task = new TimerTask() {
                                @Override
                                public void run() {
                                    System.out.println("시간 초과!");
                                }
                            };
                            timer.schedule(task, TIME_LIMIT);

                            AtomicInteger userAnswer1 = new AtomicInteger(-1);
                            Thread inputThread = new Thread(() -> {
                                try {
                                    userAnswer1.set(in.nextInt());
                                } catch (Exception e) {
                                    // 입력 오류 처리
                                } finally {
                                    timer.cancel();
                                }
                            });
                            inputThread.start();
                            try {
                                inputThread.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            long endTime = System.currentTimeMillis();
                            long elapsedTime = endTime - startTime;

                            // AtomicInteger를 사용할 때는 .get() 메소드를 사용해 값을 가져옵니다.
                            int answerValue = userAnswer1.get();
                            if (answerValue == -1) {
                                System.out.println("정답: " + answer);
                                System.out.println("점수: " + score);
                                System.out.println("시간: " + (elapsedTime / 1000.0) + "초 (시간 초과)");
                                score -= 10;
                            } else if (answerValue == answer) {
                                System.out.println("정답");
                                score += 20;
                                System.out.println("점수: " + score);
                            } else {
                                System.out.println("오답");
                                score -= 10;
                                System.out.println("점수: " + score);
                            }
                        }

                        if (score >= 220) {
                            System.out.println("대단합니다! 이어서 다음 단계로 넘어가겠습니다!");
                            System.out.println("다음 단계로 넘어가시려면 아무키나 입력하세요...");
                            in.nextLine(); 
                            in.nextLine();

                            for (int i = 0; i < 5; i++) {
                                x = random.nextInt(9) + 1;
                                y = random.nextInt(9) + 1;
                                answer = ((x * 10) + y) * x;
                                System.out.println();
                                System.out.println(((x * 10) + y) + " X " + x + " = ??");

                                Timer timer = new Timer();
                                long startTime = System.currentTimeMillis();
                                TimerTask task = new TimerTask() {
                                    @Override
                                    public void run() {
                                        System.out.println("시간 초과!");
                                    }
                                };
                                timer.schedule(task, TIME_LIMIT);

                                AtomicInteger userAnswer1 = new AtomicInteger(-1);
                                Thread inputThread = new Thread(() -> {
                                    try {
                                        userAnswer1.set(in.nextInt());
                                    } catch (Exception e) {
                                        // 입력 오류 처리
                                    } finally {
                                        timer.cancel();
                                    }
                                });
                                inputThread.start();
                                try {
                                    inputThread.join();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                long endTime = System.currentTimeMillis();
                                long elapsedTime = endTime - startTime;

                                // AtomicInteger를 사용할 때는 .get() 메소드를 사용해 값을 가져옵니다.
                                int answerValue = userAnswer1.get();
                                if (answerValue == -1) {
                                    System.out.println("정답: " + answer);
                                    System.out.println("점수: " + score);
                                    System.out.println("시간: " + (elapsedTime / 1000.0) + "초 (시간 초과)");
                                    score -= 10;
                                } else if (answerValue == answer) {
                                    System.out.println("정답");
                                    score += 20;
                                    System.out.println("점수: " + score);
                                } else {
                                    System.out.println("오답");
                                    score -= 10;
                                    System.out.println("점수: " + score);
                                }
                            }

                            // 3단계 완료 후 다시 도전할지 묻기
                            System.out.println("축하합니다! 3단계를 완료했습니다!");
                            System.out.println("다시 도전하시겠습니까? (y/n)");
                            in.nextLine(); 
                            String response = in.nextLine();
                            if (response.equalsIgnoreCase("n")) {
                                retry = false;
                                play = false;
                            }
                        } else {
                            System.out.println("아쉽습니다! 다시 도전하시겠습니까?");
                            System.out.println("다시 도전하시려면 아무키나 입력하세요...");
                            in.nextLine(); 
                            in.nextLine();
                            score = 0;
                            continue;
                        }
                    } else {
                        System.out.println("아쉽습니다! 다시 도전하시겠습니까?");
                        System.out.println("다시 도전하시려면 아무키나 입력하세요...");
                        in.nextLine(); 
                        in.nextLine();
                        score = 0;
                        continue;
                    }
                }
                scores[j] = score;
                System.out.println("게임 종료! 최종 점수:");
                for (int i = 0; i < 3; i++) {
                    System.out.println("아이디: " + ids[i] + ", 최종 점수: " + scores[i]);
                }
            }
        }
        in.close();
    }
}

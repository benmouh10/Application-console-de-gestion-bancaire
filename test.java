
@Test
public void testDeposit() {
    CompteBancaire account = new CompteBancaire("123", 100);
    account.deposit(50);
    assertEquals(150, account.getSolde());
}

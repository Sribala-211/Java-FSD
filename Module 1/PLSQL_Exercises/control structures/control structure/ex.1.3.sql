SET SERVEROUTPUT ON;
BEGIN
   FOR rec IN (SELECT customer_id, loan_due_date 
               FROM loans
               WHERE loan_due_date <= SYSDATE + 30) LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ' 
                           || rec.customer_id 
                           || ' is due on ' 
                           || TO_CHAR(rec.loan_due_date, 'DD-MON-YYYY'));
   END LOOP;
END;
/

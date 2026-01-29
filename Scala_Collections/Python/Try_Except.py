import logging
n = 5
try:
    n/0
except Exception as e:
    print("Error :",e)
    logging.error(e)
    raise